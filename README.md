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

### **app/build.gradle.kts**
```kotlin
dependencies {
    implementation(project(":mvvmPure"))
    // Swap to another module to test different architecture:
    // implementation(project(":mvvmRepository"))
    // implementation(project(":mvvmClean"))
    // implementation(project(":mviPure"))
    // implementation(project(":mvvmMvi"))
}
```

---

## 🏗️ Features
- Login/IAM  
- Profile editing  
- Help section  

---

## 🚀 Usage
1. Clone the repository.  
2. Open in Android Studio.  
3. Select the active architecture by editing `app/build.gradle.kts` dependency.  
4. Run the app to see the chosen architecture in action.  

---

## 📸 Screenshots (to be added)
- Home screen with categories.  
- Login flow.  
- Profile editing.  

---

## 🎯 Outcome
This project serves as a **learning lab** for Android developers:
- Compare architectures side by side.  
- Understand trade-offs in complexity, scalability, and readability.  
