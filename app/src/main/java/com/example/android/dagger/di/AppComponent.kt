package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationActivity
import dagger.Component

@Component(modules = [StorageModule::class])
interface AppComponent {

    // RegistrationActivity 가 주입을 요청하고 @Inject 종속성을 제공해야함
    fun inject(activity: RegistrationActivity)
}