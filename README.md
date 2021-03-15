# CodeView
A code viewing library for displaying code in Android apps, built entirely in Kotlin. 

## Usage
**Step 1.** Make sure `mavenCentral()` is added as a dependency in your root gradle file:
```groovy
allprojects {
    repositories {
        mavenCentral()
    }
}
```

**Step 2.** Add the dependency to your app's project gradle file:
```groovy
dependencies {
    implementation 'me.jackdevey:codeview:1.0.1'
}
```

**Step 3.** Add the CodeView to your layout
```xml
<me.jackdevey.codeview.CodeView
    android:id="@+id/code_view"
    android:layout_width="match_parent"
    android:layout_height="match_parent"/>
```

**Step 4.** Customise the CodeView
```kotlin
binding.codeView.with{
 fontSize = 14f
 code = "Code"
 show()
}

```

## Customisation
You can customise the CodeView to make sure that it fits with the theme of your app using the variables below:
> After any change is made, make sure that you use `show()` to re-draw the changes onto the view.

| Variable | Data type | Description | Default | Working |
|----------|-----------|-------------|---------|--------|
| code | String | The code to display on the view | "No code provided" | ✔ |
| fontSize | Float | The font size of the text | 14f | ✔ |
| numberLines | Boolean | Number each line | true | ✔ |
| backgroundColour | Color | The colour of the background | GREY | ❌ |



## License
This library is licensed under the [Apache Software License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).

See [`LICENSE`](LICENSE) for full of the license text.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
