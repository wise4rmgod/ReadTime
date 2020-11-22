[![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://GitHub.com/Naereen/StrapDown.js/graphs/commit-activity)
[![Open Source Love svg1](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badges/)
[![GitHub license](https://img.shields.io/github/license/Naereen/StrapDown.js.svg)](https://github.com/Naereen/StrapDown.js/blob/master/LICENSE)
[![](https://jitpack.io/v/wise4rmgod/ReadTime.svg)](https://jitpack.io/#wise4rmgod/ReadTime)

# MinRead
A Simple Android library to get the number of words and give you the time it will take you to finish an article/story.

# Prerequisite
* Androidx
* Kotlin

![Alt Text](https://res.cloudinary.com/wise4rmgod/image/upload/c_thumb,w_200,g_face/v1599270133/Screenshot_2020-09-05_at_02.40.45.png)


# How to set up
And add a dependency code to your module's build.gradle file.
``` groovy
dependencies {
    implementation "com.github.wise4rmgod:ReadTime:$version"
}
```
Add below codes to your root build.gradle file (not your module build.gradle file).
``` groovy
allprojects {
    repositories {
        // ...
        maven { url 'https://jitpack.io' }
    }
}
```

## Example

```kotlin


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ty = "f your audience reads slower or faster than 200 words per minute — \n" +
                "        perhaps your blog is in English, which isn’t your audience’s first language, or perhaps your material is extremely\n" +
                "        basic and easy to skim — then you’ll want to use calculator instead. First, you’ll have to divide your total word \n" +
                "        count by the average words read per minute of your audience. Let’s say your 938-word article has an audience that \n" +
                "        reads 150 words per minute. That gives you 6.253. Enter 6.253 into the Decimal-to-Time Calculator, choose “Minutes” \n" +
                "        from the drop-down menu and press “Calculate.”\n" +
                "        Immediately, you’ll get a minute and seconds estimate. In this case, it’s 6 minutes and 15 seconds."
        
        wordct.text = Minread.countWords(ty).toString()

        minread.text = Minread.minread(ty)
	
        //custom message in the min read
        minread.text = Minread.custome_minread(ty,"min read")

    }
}



```
## Contributions and Issues
feel free to open an issue if any or contribute to it, its an open source library.

## Licence
MIT License

## Author
nwokocha Wisdom - Android Engineer @Savics
