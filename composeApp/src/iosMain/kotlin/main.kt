import androidx.compose.ui.window.ComposeUIViewController
import com.kis.liberai.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController {
    return ComposeUIViewController { App() }
}
