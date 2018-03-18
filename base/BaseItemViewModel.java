package com.gmail.test.base;

public abstract class BaseItemViewModel<Model> implements BaseViewModel {

    public abstract void setItem(Model item, int position);

    @Override
    public void init() {
    }

    @Override
    public void release() {
    }
}















