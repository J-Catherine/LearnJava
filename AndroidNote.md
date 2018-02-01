# Android安装记

+   安装Android Studio

    +   。。。

    +   C:\Program Files\Android\Android Studio

    +   官网上没有SDK，直接下载后翻墙联网会自动下载。但是要翻到一个靠谱的地方，全局模式

        实际上是比较好下的，就是速度比较慢

+   安装Android SDK

    +   C:\Users\Catherine_JY\AndroidSdk
    +   platform-tools 工具文件夹，下载一次即可
    +   platforms 对应不同版本的平台
    +   build-tools 对应不同平台版本的构建工具
    +   tools 安装一次即可
    +   emulator 模拟器，下载一次即可
    +   sources 对应不同版本安卓资源
    +   system-images 不同版本的系统镜像，用于安装虚拟机

+   gradle工具

    +   自动化构建Android应用
    +   C:\Users\Catherine_JY\.gradle
    +   下载很慢（即使翻了墙）
        +   下好对应版本东西放在此中对应版本的文件夹里：C:\Users\Catherine_JY\.gradle\wrapper\dists
        +   在Android Studio的Gradle Script - build.gradle文件中的两处repositories中加入  maven{ url 'http://maven.aliyun.com/nexus/content/groups/public/'}
    +   目前用的是4.1，不同版本需要重新下载

+   安卓虚拟机

    +   C:\Users\Catherine_JY\.android
    +   可在Android Studio的AVD Manager（右上角的小按钮）中管理

+   操作过程

    +   新建
    +   打开之后，会自动进行Gradle sync started，若卡在此很久，说明网不行，解决方法见上（-下载很慢）
    +   make project（构建） 和 run（构建+运行），run之后要点停止，不要随便关掉虚拟机，因为启动会很慢