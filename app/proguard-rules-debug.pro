-dontobfuscate
-dontoptimize

-dontwarn okio.**
-dontwarn kotlin.**
-dontwarn retrofit2.**
-dontwarn okhttp3.**
-dontwarn org.simpleframework.xml.**

-keep class org.simpleframework.xml.**{ *; }
-keepclassmembers,allowobfuscation class * {
    @org.simpleframework.xml.* <fields>;
    @org.simpleframework.xml.* <init>(...);
}