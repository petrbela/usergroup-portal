/**
 * DaoSettingObjectify.java, 28.7.2011 16:06:51 
 */
package ugportal.dao.objectify;

import ugportal.dao.DaoSetting;
import ugportal.model.Invitation;
import ugportal.model.Setting;

import com.googlecode.objectify.util.DAOBase;

/**
 * @author Tomas
 */
public class DaoSettingObjectify extends DAOBase implements DaoSetting {

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoSetting#get()
     */
    @Override
    public Invitation get() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoSetting#put(ugportal.model.Setting)
     */
    @Override
    public void put(Setting setting) {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoSetting#delete(ugportal.model.Setting)
     */
    @Override
    public void delete(Setting setting) {
        // TODO Auto-generated method stub

    }

}
