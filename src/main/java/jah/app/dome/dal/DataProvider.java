package jah.app.dome.dal;

import jah.app.dome.models.Model;

import java.util.List;

/**
 * Database access, to provide simple CRUD functionality.
 */
public interface DataProvider<ModelT extends Model> {

  public List<ModelT> getData();
}
