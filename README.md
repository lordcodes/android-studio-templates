# Android Studio Templates 🗺

[![License](https://img.shields.io/badge/license-Apache%202.0-green.svg)](https://github.com/lordcodes/android-studio-templates/blob/master/LICENSE)
[![@lordcodes](https://img.shields.io/badge/contact-@lordcodes-blue.svg?style=flat)](https://twitter.com/lordcodes)
[![Lord Codes Blog](https://img.shields.io/badge/blog-Lord%20Codes-yellow.svg?style=flat)](https://www.lordcodes.com)

A selection of templates for use within Android Studio (or IntelliJ), focusing on Kotlin and Android.

## Installation

### Copy individual template

1. In Android Studio go to Preferences -> Editor -> File and Code Templates
2. Select desired scheme:
  1. Default (global template)
  2. Project (current open project - can be shared via Git)
3. Open File tab
4. Click '+'
5. Enter name and extension (likely `kt`)
6. Copy template contents from this repository
7. Paste template contents into Android Studio
8. Click 'Apply' or 'OK'
9. Enjoy. 🚀

### Bulk install for project

1. Clone the repository, or download a copy of latest master branch commit.
2. Copy the contents of fileTemplates
3. Place into `PROJECT_DIR/.idea/fileTemplates/`
4. Enjoy. 🚀

## File Templates

### [Dagger Activity Module](fileTemplates/Dagger-Activity-Module.kt)

A module for Dagger Android that uses @ContributesAndroidInjector for injection into an Activity.

### [Dagger Static Module](fileTemplates/Dagger-Static-Module.kt)

A static module for Dagger to provide regular (non-component dependencies)

### [Kotlin data class](fileTemplates/Kotlin-Data-Class.kt)

Create a basic Kotlin data class really quickly

## Contributing

If you notice any typing mistakes or errors in the templates, then please feel free to let me know with a PR.