package com.dimon.ganwumei.database;

import android.app.Application;

import com.dimon.ganwumei.database.entities.Image;
import com.dimon.ganwumei.database.entities.News;
import com.dimon.ganwumei.database.entities.Types;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by Dimon on 2016/3/27.
 */
public class RealmDataService implements DataService {

    @Inject
    Application application;

    @Override
    public Observable<List<News>> newsList() {
        return null;
    }

    @Override
    public Observable<News> news() {
        return null;
    }

    @Override
    public Observable<Image> findImages(String url) {
        return null;
    }

    @Override
    public Observable<List<News>> newsListByImages(Image image) {
        return null;
    }

    @Override
    public Observable<News> newNews(String type, String desc, String url, Image image, List<Types> types) {
        return null;
    }

}