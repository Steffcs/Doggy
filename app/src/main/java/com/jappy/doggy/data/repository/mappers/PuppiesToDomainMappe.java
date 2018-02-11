package com.jappy.doggy.data.repository.mappers;

import com.jappy.doggy.data.remote.response.BreedImageResponse;
import com.jappy.doggy.domain.model.PuppiesImage;
import com.jappy.jappy_core.data.repository.Mapper;

import javax.inject.Inject;

/**
 * Created by irenecedeno on 10-02-18.
 */

public class PuppiesToDomainMappe extends Mapper<BreedImageResponse, PuppiesImage> {


    @Inject
    public PuppiesToDomainMappe() {


    }


    @Override
    public PuppiesImage map(BreedImageResponse value) {
        PuppiesImage puppiesImage = new PuppiesImage();
        puppiesImage.status = value.status;
        puppiesImage.message = value.message;

        return puppiesImage;

    }

    @Override
    public BreedImageResponse reverseMap(PuppiesImage value) {
        throw new UnsupportedOperationException();
    }
}
