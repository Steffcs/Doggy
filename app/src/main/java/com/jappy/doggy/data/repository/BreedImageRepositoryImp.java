package com.jappy.doggy.data.repository;

import com.jappy.doggy.data.remote.DoggyApi;
import com.jappy.doggy.data.remote.response.BreedImageResponse;
import com.jappy.doggy.data.repository.mappers.PuppiesToDomainMappe;
import com.jappy.doggy.domain.model.PuppiesImage;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

/**
 * Created by irenecedeno on 10-02-18.
 */

public class BreedImageRepositoryImp implements BreedImageRepository {

    DoggyApi apiService;
    PuppiesToDomainMappe puppiesToDomainMappe;


    @Inject
    public BreedImageRepositoryImp(DoggyApi apiService, PuppiesToDomainMappe puppiesToDomainMappe) {
        this.apiService = apiService;
        this.puppiesToDomainMappe=puppiesToDomainMappe;

    }
    @Override
    public Observable<PuppiesImage> getPuppiesImage(String name) {



        return apiService.getPuppiesImages(name).map(new Function<BreedImageResponse, PuppiesImage>() {
            @Override
            public PuppiesImage apply(BreedImageResponse puppiesResponse) throws Exception {
                return puppiesToDomainMappe.map(puppiesResponse);
            }
        });
    }
}
