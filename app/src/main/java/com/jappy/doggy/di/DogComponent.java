package com.jappy.doggy.di;

import android.app.Activity;

import com.jappy.doggy.presentation.BreedFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by irenecedeno on 09-02-18.
 */

@Singleton
@Component(modules = {DogModule.class})
public interface DogComponent extends  FragmentComponent<BreedFragment> {

}
