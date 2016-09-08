package bernie.greendao.dao;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig browseAssBookMarksDaoConfig;

    private final BrowseAssBookMarksDao browseAssBookMarksDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        browseAssBookMarksDaoConfig = daoConfigMap.get(BrowseAssBookMarksDao.class).clone();
        browseAssBookMarksDaoConfig.initIdentityScope(type);

        browseAssBookMarksDao = new BrowseAssBookMarksDao(browseAssBookMarksDaoConfig, this);

        registerDao(BrowseAssBookMarks.class, browseAssBookMarksDao);
    }
    
    public void clear() {
        browseAssBookMarksDaoConfig.clearIdentityScope();
    }

    public BrowseAssBookMarksDao getBrowseAssBookMarksDao() {
        return browseAssBookMarksDao;
    }

}
