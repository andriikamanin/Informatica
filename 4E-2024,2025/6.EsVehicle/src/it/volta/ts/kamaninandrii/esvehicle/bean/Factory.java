package it.volta.ts.kamaninandrii.esvehicle.bean;

public interface Factory<T> {

	T create(String name, String price);
}
