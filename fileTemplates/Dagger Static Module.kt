#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}#end

import dagger.Module
import dagger.Provides

#parse("File Header.java")
@Module
object ${NAME} {
    @JvmStatic
    @Provides
    fun provideDependency() = "dependencyValue"
}