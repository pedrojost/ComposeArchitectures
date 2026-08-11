# 📘 ComposeArchitectures

**ComposeArchitectures** is an educational showcase of modern Android architectures, built with **Jetpack Compose**.  

---

## 🎯 Purpose
- Serve as a practical lab to study and compare Android architectures.  
- Demonstrate how the same app can be structured using **MVVM Pure**, **MVVM + Repository Pattern**, **MVVM + Clean Architecture**, **MVI Pure**, and **MVVM + MVI**.  

---

## 📂 Project Structure

```
ComposeArchitectures/
 ├── app/                        <-- Main module (UI, navigation, theme)
 ├── mvvmPure/                   <-- Module 1: MVVM Pure
 ├── mvvmRepository/             <-- Module 2: MVVM + Repository Pattern
 ├── mvvmClean/                  <-- Module 3: MVVM + Clean Architecture
 ├── mviPure/                    <-- Module 4: MVI Pure
 └── mvvmMvi/                    <-- Module 5: MVVM + MVI
```

- **app**: Hosts shared UI (Compose screens, navigation, theming).  
- **architecture modules**: Each module contains its own implementation of `HomeViewModel` and business logic following the chosen pattern.

---

## ⚙️ Configuration

### **settings.gradle.kts**
```kotlin
include(":app")
include(":mvvmPure")
include(":mvvmRepository")
include(":mvvmClean")
include(":mviPure")
include(":mvvmMvi")
```

### **C:\Users\pedro\AndroidStudioProjects\ComposeArchitectures\app\src\main\java\com\phj\composearchitectures\MainActivity.kt**
```kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            com.phj.mvvmpure.ui.HomeScreen()
          //com.phj.mvipure.HomeScreen()
        }
    }
}
```

---

## 🏗️ Features
- List of contents  
- Contact information

---

## 🚀 Usage
1. Clone the repository.  
2. Open in Android Studio.  
3. Select the active architecture by editing `app/MainActivity.kt` desired HomeScreen.  
4. Run the app to see the chosen architecture in action.  

---

## 📸 Screenshots (to be added)
- 

---

## 🎯 Outcome
This project serves as a **learning lab** for Android developers:
- Compare architectures side by side.  
- Understand trade-offs in complexity, scalability, and readability.  
