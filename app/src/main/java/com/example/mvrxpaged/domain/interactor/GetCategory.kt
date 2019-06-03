package com.example.mvrxpaged.domain.interactor

import com.example.mvrxpaged.di.ApplicationScope
import com.example.mvrxpaged.domain.entity.CategoryData
import com.example.mvrxpaged.domain.repository.MainRepository
import io.reactivex.Observable
import javax.inject.Inject

@ApplicationScope
class GetCategory @Inject constructor(
    private val mainRepository: MainRepository
) {


    operator fun invoke(code: String): Observable<CategoryData> {
        return mainRepository.getCategory(code)
    }
}