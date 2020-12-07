package com.example.android.dagger.di

import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

// Tells Dagger this is a Dagger module
// Because of @Binds, StorageModule needs to be an abstract class
// StroageMudule가 abstract 인 이유는 provideStorage가 abstract라서임
@Module
abstract class StorageModule {
    // Makes Dagger provide SharedPreferencesStorage when a Storage type is requested
    // 메소드 이름은 중요하지 않음, Dagger 는 단지 parameter 와 return 을 봄
    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage
}