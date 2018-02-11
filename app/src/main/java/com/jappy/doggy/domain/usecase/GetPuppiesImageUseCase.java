package com.jappy.doggy.domain.usecase;

import com.jappy.doggy.data.repository.BreedImageRepository;
import com.jappy.doggy.domain.model.PuppiesImage;
import com.jappy.jappy_core.domian.usecase.UseCase;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by irenecedeno on 10-02-18.
 */

public class GetPuppiesImageUseCase extends UseCase<PuppiesImage> {

    BreedImageRepository puppiesImageRepository;
    private String  data;

    @Inject
    public GetPuppiesImageUseCase(BreedImageRepository puppiesImageRepository) {
        this.puppiesImageRepository=puppiesImageRepository;
    }

    public GetPuppiesImageUseCase setData(String data) {
        this.data = data;
        return this;
    }

    @Override
    protected Observable<PuppiesImage> createObservableUseCase() {
        return puppiesImageRepository.getPuppiesImage(data);
    }

}