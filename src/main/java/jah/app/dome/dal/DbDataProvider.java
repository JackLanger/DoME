package jah.app.dome.dal;

import jah.app.dome.models.Model;

import java.util.List;

public abstract class DbDataProvider<ModelT extends Model> implements DataProvider<ModelT>,DataBaseConnector<ModelT> {

  /**
   * Protected constructor
   */
  protected DbDataProvider(){

    //empty constructor
  }

  @Override
  public List<ModelT> getData() {
    return null;
  }

  @Override
  public boolean writeData(final List<ModelT> data) {
    return false;
  }

  @Override
  public boolean deleteEntity(final ModelT entity) {
    return false;
  }
}
