#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}#end

import android.app.Activity
import dagger.Module
import dagger.android.ContributesAndroidInjector

#parse("File Header.java")
@Module
abstract class ${NAME} {
    @ContributesAndroidInjector
    abstract fun bindActivity(): Activity
}