package com.morrine.iceberry.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.morrine.iceberry.data.UserDatabase
import com.morrine.iceberry.repository.UserRepository
import com.morrine.iceberry.ui.theme.screens.about.AboutScreen
import com.morrine.iceberry.ui.theme.screens.about.TrialScreen
import com.morrine.iceberry.ui.theme.screens.auth.LoginScreen
import com.morrine.iceberry.ui.theme.screens.auth.RegisterScreen
import com.morrine.iceberry.ui.theme.screens.dashboard.DashBoardScreen
import com.morrine.iceberry.ui.theme.screens.form.FormScreen
import com.morrine.iceberry.ui.theme.screens.home.HomeScreen
import com.morrine.iceberry.ui.theme.screens.intent.IntentScreen
import com.morrine.iceberry.ui.theme.screens.item.ItemScreen
import com.morrine.iceberry.ui.theme.screens.products.AddProductScreen
import com.morrine.iceberry.ui.theme.screens.products.EditProductScreen
import com.morrine.iceberry.ui.theme.screens.products.ProductListScreen
import com.morrine.iceberry.ui.theme.screens.service.ServiceScreen
import com.morrine.iceberry.ui.theme.screens.splash.SplashScreen
import com.morrine.iceberry.ui.theme.screens.start.StartScreen
import com.morrine.iceberry.viewmodel.AuthViewModel
import com.morrine.iceberry.viewmodel.ProductViewModel

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController =  rememberNavController(),
    startDestination: String = ROUT_ADD_PRODUCT,
    productViewModel: ProductViewModel = viewModel(),
) {
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_DASHBOARD) {
            DashBoardScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_FORM) {
            FormScreen(navController)
        }
        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }

        // PRODUCTS
        composable(ROUT_ADD_PRODUCT) {
            AddProductScreen(navController, productViewModel)
        }

        composable(ROUT_PRODUCT_LIST) {
            ProductListScreen(navController, productViewModel)
        }

        composable(
            route = ROUT_EDIT_PRODUCT,
            arguments = listOf(navArgument("productId") { type = NavType.IntType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId")
            if (productId != null) {
                EditProductScreen(productId, navController, productViewModel)
            }
        }











    }
}