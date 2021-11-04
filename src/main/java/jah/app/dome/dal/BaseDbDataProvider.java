package jah.app.dome.dal;

import jah.app.dome.models.Model;

import java.util.List;

/**
 * {@link BaseDbDataProvider} Singleton class for DataBase Access with CRUD functionality.
 *
 * @param <ModelT> {@link Model} to be written and or read
 */
public abstract class BaseDbDataProvider<ModelT extends Model> implements DataProvider<ModelT>,DataBaseConnector<ModelT> {

  /**
   * Protected constructor
   */
  protected BaseDbDataProvider(){

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
