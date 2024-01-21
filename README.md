# ImageCardView Library
ImageCardView with Awesome Shadows and Fully Customizable Library for Android.

![Platform](http://img.shields.io/badge/platform-android-blue.svg?style=flat)
[![](https://jitpack.io/v/enskoc/ImageCardView.svg)](https://jitpack.io/#enskoc/ImageCardView)

# Overview
![Screenshot 2024-01-18 at 14 44 52](https://github.com/enskoc/ImageCardView/assets/35779648/7380a9f6-ded4-47b9-bc75-13857f1b3948)

https://github.com/enskoc/ImageCardView/assets/35779648/fdff99f4-87a1-4b3c-b896-c974f8dba531

# Setup 
### Maven
Add Maven Central to your build file's list of repositories.

```groovy
repositories {
   ...
   mavenCentral()
   maven { url 'https://jitpack.io' }
   ...
}
```
to use the Maven Central Repository

```groovy
dependencies {
    ...
    implementation 'com.github.enskoc:ImageCardView:v0.0.1’
    ...
}
```

## Declaring the view

After you have the Library correctly setup, just declare the ImageCardView in your xml:

```xml
<com.eneskoc.imagecardview.ImageCardView
    android:id="@+id/imageCardView"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:titleText="Lorem Ipsum"
    app:titleColor="@color/teal_200"
    app:contentText="Lorem Ipsum is simply dummy text of the printing..."
    app:contentTextColor="@color/teal_700"
    app:contentViewColor="@color/purple_200"
    app:buttonText="Show Detail"
    app:buttonColor="@color/white"
    app:buttonTextColor="@color/black" />
```

# Configuration - Props
Coming soon




