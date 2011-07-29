/**
 * DaoSettingObjectify.java, 28.7.2011 16:06:51 
 */
package ugportal.dao.objectify;

import ugportal.dao.DaoSetting;
import ugportal.model.Setting;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.util.DAOBase;

/**
 * @author Tomas
 */
public class DaoSettingObjectify extends DAOBase implements DaoSetting {

    static {
        ObjectifyService.register(Setting.class);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoSetting#get()
     */
    @Override
    public Setting getById(Long id) {

        return null;
    }

    public Setting getByKey(Key<Setting> settingKey) {
        return ofy().get(settingKey);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoSetting#put(ugportal.model.Setting)
     */
    @Override
    public Key<Setting> put(Setting setting) {
        return ofy().put(setting);
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
