package com.liferay.docs.infos.service.persistence;

import com.liferay.docs.infos.NoSuchFarmerException;
import com.liferay.docs.infos.model.Farmer;
import com.liferay.docs.infos.model.impl.FarmerImpl;
import com.liferay.docs.infos.model.impl.FarmerModelImpl;
import com.liferay.docs.infos.service.persistence.DistrictPersistence;
import com.liferay.docs.infos.service.persistence.FarmerPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the farmer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joe Bloggs
 * @see FarmerPersistence
 * @see FarmerUtil
 * @generated
 */
public class FarmerPersistenceImpl extends BasePersistenceImpl<Farmer>
    implements FarmerPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link FarmerUtil} to access the farmer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = FarmerImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            FarmerModelImpl.GROUPID_COLUMN_BITMASK |
            FarmerModelImpl.ORGNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "farmer.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_O = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_O",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_O = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_O",
            new String[] { Long.class.getName(), String.class.getName() },
            FarmerModelImpl.GROUPID_COLUMN_BITMASK |
            FarmerModelImpl.ORGNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_O = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_O",
            new String[] { Long.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_G_O_GROUPID_2 = "farmer.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_O_ORGNAME_1 = "farmer.orgName IS NULL";
    private static final String _FINDER_COLUMN_G_O_ORGNAME_2 = "farmer.orgName = ?";
    private static final String _FINDER_COLUMN_G_O_ORGNAME_3 = "(farmer.orgName IS NULL OR farmer.orgName = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_I = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_I",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_I = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_I",
            new String[] { Long.class.getName(), String.class.getName() },
            FarmerModelImpl.GROUPID_COLUMN_BITMASK |
            FarmerModelImpl.INN_COLUMN_BITMASK |
            FarmerModelImpl.ORGNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_I = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_I",
            new String[] { Long.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_G_I_GROUPID_2 = "farmer.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_I_INN_1 = "farmer.inn IS NULL";
    private static final String _FINDER_COLUMN_G_I_INN_2 = "farmer.inn = ?";
    private static final String _FINDER_COLUMN_G_I_INN_3 = "(farmer.inn IS NULL OR farmer.inn = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_D = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_D",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_D = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_D",
            new String[] { Long.class.getName(), Long.class.getName() },
            FarmerModelImpl.GROUPID_COLUMN_BITMASK |
            FarmerModelImpl.DISTRICTID_COLUMN_BITMASK |
            FarmerModelImpl.ORGNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_D = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_D",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_G_D_GROUPID_2 = "farmer.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_D_DISTRICTID_2 = "farmer.districtId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_R = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_R",
            new String[] {
                Long.class.getName(), Date.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_R",
            new String[] { Long.class.getName(), Date.class.getName() },
            FarmerModelImpl.GROUPID_COLUMN_BITMASK |
            FarmerModelImpl.REGDATE_COLUMN_BITMASK |
            FarmerModelImpl.ORGNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_R = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_R",
            new String[] { Long.class.getName(), Date.class.getName() });
    private static final String _FINDER_COLUMN_G_R_GROUPID_2 = "farmer.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_R_REGDATE_1 = "farmer.regDate IS NULL";
    private static final String _FINDER_COLUMN_G_R_REGDATE_2 = "farmer.regDate = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_A = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_A",
            new String[] {
                Long.class.getName(), Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, FarmerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_A",
            new String[] { Long.class.getName(), Boolean.class.getName() },
            FarmerModelImpl.GROUPID_COLUMN_BITMASK |
            FarmerModelImpl.ISARCHIVED_COLUMN_BITMASK |
            FarmerModelImpl.ORGNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_A = new FinderPath(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_A",
            new String[] { Long.class.getName(), Boolean.class.getName() });
    private static final String _FINDER_COLUMN_G_A_GROUPID_2 = "farmer.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_A_ISARCHIVED_2 = "farmer.isArchived = ?";
    private static final String _SQL_SELECT_FARMER = "SELECT farmer FROM Farmer farmer";
    private static final String _SQL_SELECT_FARMER_WHERE = "SELECT farmer FROM Farmer farmer WHERE ";
    private static final String _SQL_COUNT_FARMER = "SELECT COUNT(farmer) FROM Farmer farmer";
    private static final String _SQL_COUNT_FARMER_WHERE = "SELECT COUNT(farmer) FROM Farmer farmer WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "farmer.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Farmer exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Farmer exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(FarmerPersistenceImpl.class);
    private static Farmer _nullFarmer = new FarmerImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Farmer> toCacheModel() {
                return _nullFarmerCacheModel;
            }
        };

    private static CacheModel<Farmer> _nullFarmerCacheModel = new CacheModel<Farmer>() {
            @Override
            public Farmer toEntityModel() {
                return _nullFarmer;
            }
        };

    @BeanReference(type = DistrictPersistence.class)
    protected DistrictPersistence districtPersistence;
    protected TableMapper<Farmer, com.liferay.docs.infos.model.District> farmerToDistrictTableMapper;

    public FarmerPersistenceImpl() {
        setModelClass(Farmer.class);
    }

    /**
     * Returns all the farmers where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByGroupId(long groupId) throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the farmers where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of farmers
     * @param end the upper bound of the range of farmers (not inclusive)
     * @return the range of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
    }

    /**
     * Returns an ordered range of all the farmers where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of farmers
     * @param end the upper bound of the range of farmers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByGroupId(long groupId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId, start, end, orderByComparator };
        }

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Farmer farmer : list) {
                if ((groupId != farmer.getGroupId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_FARMER_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FarmerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first farmer in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByGroupId_First(groupId, orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
    }

    /**
     * Returns the first farmer in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Farmer> list = findByGroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last farmer in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByGroupId_Last(groupId, orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
    }

    /**
     * Returns the last farmer in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<Farmer> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the farmers before and after the current farmer in the ordered set where groupId = &#63;.
     *
     * @param farmerId the primary key of the current farmer
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer[] findByGroupId_PrevAndNext(long farmerId, long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = findByPrimaryKey(farmerId);

        Session session = null;

        try {
            session = openSession();

            Farmer[] array = new FarmerImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, farmer, groupId,
                    orderByComparator, true);

            array[1] = farmer;

            array[2] = getByGroupId_PrevAndNext(session, farmer, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Farmer getByGroupId_PrevAndNext(Session session, Farmer farmer,
        long groupId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FARMER_WHERE);

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(FarmerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(farmer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Farmer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the farmers where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupId(long groupId) throws SystemException {
        for (Farmer farmer : findByGroupId(groupId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(farmer);
        }
    }

    /**
     * Returns the number of farmers where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByGroupId(long groupId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_FARMER_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the farmers where groupId = &#63; and orgName = &#63;.
     *
     * @param groupId the group ID
     * @param orgName the org name
     * @return the matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByG_O(long groupId, String orgName)
        throws SystemException {
        return findByG_O(groupId, orgName, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the farmers where groupId = &#63; and orgName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param orgName the org name
     * @param start the lower bound of the range of farmers
     * @param end the upper bound of the range of farmers (not inclusive)
     * @return the range of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByG_O(long groupId, String orgName, int start,
        int end) throws SystemException {
        return findByG_O(groupId, orgName, start, end, null);
    }

    /**
     * Returns an ordered range of all the farmers where groupId = &#63; and orgName = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param orgName the org name
     * @param start the lower bound of the range of farmers
     * @param end the upper bound of the range of farmers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByG_O(long groupId, String orgName, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_O;
            finderArgs = new Object[] { groupId, orgName };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_O;
            finderArgs = new Object[] {
                    groupId, orgName,
                    
                    start, end, orderByComparator
                };
        }

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Farmer farmer : list) {
                if ((groupId != farmer.getGroupId()) ||
                        !Validator.equals(orgName, farmer.getOrgName())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_FARMER_WHERE);

            query.append(_FINDER_COLUMN_G_O_GROUPID_2);

            boolean bindOrgName = false;

            if (orgName == null) {
                query.append(_FINDER_COLUMN_G_O_ORGNAME_1);
            } else if (orgName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_O_ORGNAME_3);
            } else {
                bindOrgName = true;

                query.append(_FINDER_COLUMN_G_O_ORGNAME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FarmerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (bindOrgName) {
                    qPos.add(orgName);
                }

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first farmer in the ordered set where groupId = &#63; and orgName = &#63;.
     *
     * @param groupId the group ID
     * @param orgName the org name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByG_O_First(long groupId, String orgName,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByG_O_First(groupId, orgName, orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", orgName=");
        msg.append(orgName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
    }

    /**
     * Returns the first farmer in the ordered set where groupId = &#63; and orgName = &#63;.
     *
     * @param groupId the group ID
     * @param orgName the org name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByG_O_First(long groupId, String orgName,
        OrderByComparator orderByComparator) throws SystemException {
        List<Farmer> list = findByG_O(groupId, orgName, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last farmer in the ordered set where groupId = &#63; and orgName = &#63;.
     *
     * @param groupId the group ID
     * @param orgName the org name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByG_O_Last(long groupId, String orgName,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByG_O_Last(groupId, orgName, orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", orgName=");
        msg.append(orgName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
    }

    /**
     * Returns the last farmer in the ordered set where groupId = &#63; and orgName = &#63;.
     *
     * @param groupId the group ID
     * @param orgName the org name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByG_O_Last(long groupId, String orgName,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_O(groupId, orgName);

        if (count == 0) {
            return null;
        }

        List<Farmer> list = findByG_O(groupId, orgName, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the farmers before and after the current farmer in the ordered set where groupId = &#63; and orgName = &#63;.
     *
     * @param farmerId the primary key of the current farmer
     * @param groupId the group ID
     * @param orgName the org name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer[] findByG_O_PrevAndNext(long farmerId, long groupId,
        String orgName, OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = findByPrimaryKey(farmerId);

        Session session = null;

        try {
            session = openSession();

            Farmer[] array = new FarmerImpl[3];

            array[0] = getByG_O_PrevAndNext(session, farmer, groupId, orgName,
                    orderByComparator, true);

            array[1] = farmer;

            array[2] = getByG_O_PrevAndNext(session, farmer, groupId, orgName,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Farmer getByG_O_PrevAndNext(Session session, Farmer farmer,
        long groupId, String orgName, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FARMER_WHERE);

        query.append(_FINDER_COLUMN_G_O_GROUPID_2);

        boolean bindOrgName = false;

        if (orgName == null) {
            query.append(_FINDER_COLUMN_G_O_ORGNAME_1);
        } else if (orgName.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_G_O_ORGNAME_3);
        } else {
            bindOrgName = true;

            query.append(_FINDER_COLUMN_G_O_ORGNAME_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(FarmerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (bindOrgName) {
            qPos.add(orgName);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(farmer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Farmer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the farmers where groupId = &#63; and orgName = &#63; from the database.
     *
     * @param groupId the group ID
     * @param orgName the org name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_O(long groupId, String orgName)
        throws SystemException {
        for (Farmer farmer : findByG_O(groupId, orgName, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(farmer);
        }
    }

    /**
     * Returns the number of farmers where groupId = &#63; and orgName = &#63;.
     *
     * @param groupId the group ID
     * @param orgName the org name
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_O(long groupId, String orgName)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_O;

        Object[] finderArgs = new Object[] { groupId, orgName };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_FARMER_WHERE);

            query.append(_FINDER_COLUMN_G_O_GROUPID_2);

            boolean bindOrgName = false;

            if (orgName == null) {
                query.append(_FINDER_COLUMN_G_O_ORGNAME_1);
            } else if (orgName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_O_ORGNAME_3);
            } else {
                bindOrgName = true;

                query.append(_FINDER_COLUMN_G_O_ORGNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (bindOrgName) {
                    qPos.add(orgName);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the farmers where groupId = &#63; and inn = &#63;.
     *
     * @param groupId the group ID
     * @param inn the inn
     * @return the matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByG_I(long groupId, String inn)
        throws SystemException {
        return findByG_I(groupId, inn, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the farmers where groupId = &#63; and inn = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param inn the inn
     * @param start the lower bound of the range of farmers
     * @param end the upper bound of the range of farmers (not inclusive)
     * @return the range of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByG_I(long groupId, String inn, int start, int end)
        throws SystemException {
        return findByG_I(groupId, inn, start, end, null);
    }

    /**
     * Returns an ordered range of all the farmers where groupId = &#63; and inn = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param inn the inn
     * @param start the lower bound of the range of farmers
     * @param end the upper bound of the range of farmers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByG_I(long groupId, String inn, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_I;
            finderArgs = new Object[] { groupId, inn };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_I;
            finderArgs = new Object[] {
                    groupId, inn,
                    
                    start, end, orderByComparator
                };
        }

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Farmer farmer : list) {
                if ((groupId != farmer.getGroupId()) ||
                        !Validator.equals(inn, farmer.getInn())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_FARMER_WHERE);

            query.append(_FINDER_COLUMN_G_I_GROUPID_2);

            boolean bindInn = false;

            if (inn == null) {
                query.append(_FINDER_COLUMN_G_I_INN_1);
            } else if (inn.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_I_INN_3);
            } else {
                bindInn = true;

                query.append(_FINDER_COLUMN_G_I_INN_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FarmerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (bindInn) {
                    qPos.add(inn);
                }

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first farmer in the ordered set where groupId = &#63; and inn = &#63;.
     *
     * @param groupId the group ID
     * @param inn the inn
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByG_I_First(long groupId, String inn,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByG_I_First(groupId, inn, orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", inn=");
        msg.append(inn);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
    }

    /**
     * Returns the first farmer in the ordered set where groupId = &#63; and inn = &#63;.
     *
     * @param groupId the group ID
     * @param inn the inn
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByG_I_First(long groupId, String inn,
        OrderByComparator orderByComparator) throws SystemException {
        List<Farmer> list = findByG_I(groupId, inn, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last farmer in the ordered set where groupId = &#63; and inn = &#63;.
     *
     * @param groupId the group ID
     * @param inn the inn
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByG_I_Last(long groupId, String inn,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByG_I_Last(groupId, inn, orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", inn=");
        msg.append(inn);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
    }

    /**
     * Returns the last farmer in the ordered set where groupId = &#63; and inn = &#63;.
     *
     * @param groupId the group ID
     * @param inn the inn
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByG_I_Last(long groupId, String inn,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_I(groupId, inn);

        if (count == 0) {
            return null;
        }

        List<Farmer> list = findByG_I(groupId, inn, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the farmers before and after the current farmer in the ordered set where groupId = &#63; and inn = &#63;.
     *
     * @param farmerId the primary key of the current farmer
     * @param groupId the group ID
     * @param inn the inn
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer[] findByG_I_PrevAndNext(long farmerId, long groupId,
        String inn, OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = findByPrimaryKey(farmerId);

        Session session = null;

        try {
            session = openSession();

            Farmer[] array = new FarmerImpl[3];

            array[0] = getByG_I_PrevAndNext(session, farmer, groupId, inn,
                    orderByComparator, true);

            array[1] = farmer;

            array[2] = getByG_I_PrevAndNext(session, farmer, groupId, inn,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Farmer getByG_I_PrevAndNext(Session session, Farmer farmer,
        long groupId, String inn, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FARMER_WHERE);

        query.append(_FINDER_COLUMN_G_I_GROUPID_2);

        boolean bindInn = false;

        if (inn == null) {
            query.append(_FINDER_COLUMN_G_I_INN_1);
        } else if (inn.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_G_I_INN_3);
        } else {
            bindInn = true;

            query.append(_FINDER_COLUMN_G_I_INN_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(FarmerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (bindInn) {
            qPos.add(inn);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(farmer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Farmer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the farmers where groupId = &#63; and inn = &#63; from the database.
     *
     * @param groupId the group ID
     * @param inn the inn
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_I(long groupId, String inn) throws SystemException {
        for (Farmer farmer : findByG_I(groupId, inn, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(farmer);
        }
    }

    /**
     * Returns the number of farmers where groupId = &#63; and inn = &#63;.
     *
     * @param groupId the group ID
     * @param inn the inn
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_I(long groupId, String inn) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_I;

        Object[] finderArgs = new Object[] { groupId, inn };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_FARMER_WHERE);

            query.append(_FINDER_COLUMN_G_I_GROUPID_2);

            boolean bindInn = false;

            if (inn == null) {
                query.append(_FINDER_COLUMN_G_I_INN_1);
            } else if (inn.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_I_INN_3);
            } else {
                bindInn = true;

                query.append(_FINDER_COLUMN_G_I_INN_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (bindInn) {
                    qPos.add(inn);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the farmers where groupId = &#63; and districtId = &#63;.
     *
     * @param groupId the group ID
     * @param districtId the district ID
     * @return the matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByG_D(long groupId, long districtId)
        throws SystemException {
        return findByG_D(groupId, districtId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the farmers where groupId = &#63; and districtId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param districtId the district ID
     * @param start the lower bound of the range of farmers
     * @param end the upper bound of the range of farmers (not inclusive)
     * @return the range of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByG_D(long groupId, long districtId, int start,
        int end) throws SystemException {
        return findByG_D(groupId, districtId, start, end, null);
    }

    /**
     * Returns an ordered range of all the farmers where groupId = &#63; and districtId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param districtId the district ID
     * @param start the lower bound of the range of farmers
     * @param end the upper bound of the range of farmers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByG_D(long groupId, long districtId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_D;
            finderArgs = new Object[] { groupId, districtId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_D;
            finderArgs = new Object[] {
                    groupId, districtId,
                    
                    start, end, orderByComparator
                };
        }

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Farmer farmer : list) {
                if ((groupId != farmer.getGroupId()) ||
                        (districtId != farmer.getDistrictId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_FARMER_WHERE);

            query.append(_FINDER_COLUMN_G_D_GROUPID_2);

            query.append(_FINDER_COLUMN_G_D_DISTRICTID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FarmerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(districtId);

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first farmer in the ordered set where groupId = &#63; and districtId = &#63;.
     *
     * @param groupId the group ID
     * @param districtId the district ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByG_D_First(long groupId, long districtId,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByG_D_First(groupId, districtId, orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", districtId=");
        msg.append(districtId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
    }

    /**
     * Returns the first farmer in the ordered set where groupId = &#63; and districtId = &#63;.
     *
     * @param groupId the group ID
     * @param districtId the district ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByG_D_First(long groupId, long districtId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Farmer> list = findByG_D(groupId, districtId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last farmer in the ordered set where groupId = &#63; and districtId = &#63;.
     *
     * @param groupId the group ID
     * @param districtId the district ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByG_D_Last(long groupId, long districtId,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByG_D_Last(groupId, districtId, orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", districtId=");
        msg.append(districtId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
    }

    /**
     * Returns the last farmer in the ordered set where groupId = &#63; and districtId = &#63;.
     *
     * @param groupId the group ID
     * @param districtId the district ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByG_D_Last(long groupId, long districtId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_D(groupId, districtId);

        if (count == 0) {
            return null;
        }

        List<Farmer> list = findByG_D(groupId, districtId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the farmers before and after the current farmer in the ordered set where groupId = &#63; and districtId = &#63;.
     *
     * @param farmerId the primary key of the current farmer
     * @param groupId the group ID
     * @param districtId the district ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer[] findByG_D_PrevAndNext(long farmerId, long groupId,
        long districtId, OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = findByPrimaryKey(farmerId);

        Session session = null;

        try {
            session = openSession();

            Farmer[] array = new FarmerImpl[3];

            array[0] = getByG_D_PrevAndNext(session, farmer, groupId,
                    districtId, orderByComparator, true);

            array[1] = farmer;

            array[2] = getByG_D_PrevAndNext(session, farmer, groupId,
                    districtId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Farmer getByG_D_PrevAndNext(Session session, Farmer farmer,
        long groupId, long districtId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FARMER_WHERE);

        query.append(_FINDER_COLUMN_G_D_GROUPID_2);

        query.append(_FINDER_COLUMN_G_D_DISTRICTID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(FarmerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        qPos.add(districtId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(farmer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Farmer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the farmers where groupId = &#63; and districtId = &#63; from the database.
     *
     * @param groupId the group ID
     * @param districtId the district ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_D(long groupId, long districtId)
        throws SystemException {
        for (Farmer farmer : findByG_D(groupId, districtId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(farmer);
        }
    }

    /**
     * Returns the number of farmers where groupId = &#63; and districtId = &#63;.
     *
     * @param groupId the group ID
     * @param districtId the district ID
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_D(long groupId, long districtId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_D;

        Object[] finderArgs = new Object[] { groupId, districtId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_FARMER_WHERE);

            query.append(_FINDER_COLUMN_G_D_GROUPID_2);

            query.append(_FINDER_COLUMN_G_D_DISTRICTID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(districtId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the farmers where groupId = &#63; and regDate = &#63;.
     *
     * @param groupId the group ID
     * @param regDate the reg date
     * @return the matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByG_R(long groupId, Date regDate)
        throws SystemException {
        return findByG_R(groupId, regDate, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the farmers where groupId = &#63; and regDate = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param regDate the reg date
     * @param start the lower bound of the range of farmers
     * @param end the upper bound of the range of farmers (not inclusive)
     * @return the range of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByG_R(long groupId, Date regDate, int start, int end)
        throws SystemException {
        return findByG_R(groupId, regDate, start, end, null);
    }

    /**
     * Returns an ordered range of all the farmers where groupId = &#63; and regDate = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param regDate the reg date
     * @param start the lower bound of the range of farmers
     * @param end the upper bound of the range of farmers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByG_R(long groupId, Date regDate, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R;
            finderArgs = new Object[] { groupId, regDate };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_R;
            finderArgs = new Object[] {
                    groupId, regDate,
                    
                    start, end, orderByComparator
                };
        }

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Farmer farmer : list) {
                if ((groupId != farmer.getGroupId()) ||
                        !Validator.equals(regDate, farmer.getRegDate())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_FARMER_WHERE);

            query.append(_FINDER_COLUMN_G_R_GROUPID_2);

            boolean bindRegDate = false;

            if (regDate == null) {
                query.append(_FINDER_COLUMN_G_R_REGDATE_1);
            } else {
                bindRegDate = true;

                query.append(_FINDER_COLUMN_G_R_REGDATE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FarmerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (bindRegDate) {
                    qPos.add(CalendarUtil.getTimestamp(regDate));
                }

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first farmer in the ordered set where groupId = &#63; and regDate = &#63;.
     *
     * @param groupId the group ID
     * @param regDate the reg date
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByG_R_First(long groupId, Date regDate,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByG_R_First(groupId, regDate, orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", regDate=");
        msg.append(regDate);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
    }

    /**
     * Returns the first farmer in the ordered set where groupId = &#63; and regDate = &#63;.
     *
     * @param groupId the group ID
     * @param regDate the reg date
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByG_R_First(long groupId, Date regDate,
        OrderByComparator orderByComparator) throws SystemException {
        List<Farmer> list = findByG_R(groupId, regDate, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last farmer in the ordered set where groupId = &#63; and regDate = &#63;.
     *
     * @param groupId the group ID
     * @param regDate the reg date
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByG_R_Last(long groupId, Date regDate,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByG_R_Last(groupId, regDate, orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", regDate=");
        msg.append(regDate);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
    }

    /**
     * Returns the last farmer in the ordered set where groupId = &#63; and regDate = &#63;.
     *
     * @param groupId the group ID
     * @param regDate the reg date
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByG_R_Last(long groupId, Date regDate,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_R(groupId, regDate);

        if (count == 0) {
            return null;
        }

        List<Farmer> list = findByG_R(groupId, regDate, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the farmers before and after the current farmer in the ordered set where groupId = &#63; and regDate = &#63;.
     *
     * @param farmerId the primary key of the current farmer
     * @param groupId the group ID
     * @param regDate the reg date
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer[] findByG_R_PrevAndNext(long farmerId, long groupId,
        Date regDate, OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = findByPrimaryKey(farmerId);

        Session session = null;

        try {
            session = openSession();

            Farmer[] array = new FarmerImpl[3];

            array[0] = getByG_R_PrevAndNext(session, farmer, groupId, regDate,
                    orderByComparator, true);

            array[1] = farmer;

            array[2] = getByG_R_PrevAndNext(session, farmer, groupId, regDate,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Farmer getByG_R_PrevAndNext(Session session, Farmer farmer,
        long groupId, Date regDate, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FARMER_WHERE);

        query.append(_FINDER_COLUMN_G_R_GROUPID_2);

        boolean bindRegDate = false;

        if (regDate == null) {
            query.append(_FINDER_COLUMN_G_R_REGDATE_1);
        } else {
            bindRegDate = true;

            query.append(_FINDER_COLUMN_G_R_REGDATE_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(FarmerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (bindRegDate) {
            qPos.add(CalendarUtil.getTimestamp(regDate));
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(farmer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Farmer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the farmers where groupId = &#63; and regDate = &#63; from the database.
     *
     * @param groupId the group ID
     * @param regDate the reg date
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_R(long groupId, Date regDate)
        throws SystemException {
        for (Farmer farmer : findByG_R(groupId, regDate, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(farmer);
        }
    }

    /**
     * Returns the number of farmers where groupId = &#63; and regDate = &#63;.
     *
     * @param groupId the group ID
     * @param regDate the reg date
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_R(long groupId, Date regDate) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_R;

        Object[] finderArgs = new Object[] { groupId, regDate };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_FARMER_WHERE);

            query.append(_FINDER_COLUMN_G_R_GROUPID_2);

            boolean bindRegDate = false;

            if (regDate == null) {
                query.append(_FINDER_COLUMN_G_R_REGDATE_1);
            } else {
                bindRegDate = true;

                query.append(_FINDER_COLUMN_G_R_REGDATE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (bindRegDate) {
                    qPos.add(CalendarUtil.getTimestamp(regDate));
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the farmers where groupId = &#63; and isArchived = &#63;.
     *
     * @param groupId the group ID
     * @param isArchived the is archived
     * @return the matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByG_A(long groupId, boolean isArchived)
        throws SystemException {
        return findByG_A(groupId, isArchived, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the farmers where groupId = &#63; and isArchived = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param isArchived the is archived
     * @param start the lower bound of the range of farmers
     * @param end the upper bound of the range of farmers (not inclusive)
     * @return the range of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByG_A(long groupId, boolean isArchived, int start,
        int end) throws SystemException {
        return findByG_A(groupId, isArchived, start, end, null);
    }

    /**
     * Returns an ordered range of all the farmers where groupId = &#63; and isArchived = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param isArchived the is archived
     * @param start the lower bound of the range of farmers
     * @param end the upper bound of the range of farmers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findByG_A(long groupId, boolean isArchived, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A;
            finderArgs = new Object[] { groupId, isArchived };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_A;
            finderArgs = new Object[] {
                    groupId, isArchived,
                    
                    start, end, orderByComparator
                };
        }

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Farmer farmer : list) {
                if ((groupId != farmer.getGroupId()) ||
                        (isArchived != farmer.getIsArchived())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_FARMER_WHERE);

            query.append(_FINDER_COLUMN_G_A_GROUPID_2);

            query.append(_FINDER_COLUMN_G_A_ISARCHIVED_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FarmerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(isArchived);

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first farmer in the ordered set where groupId = &#63; and isArchived = &#63;.
     *
     * @param groupId the group ID
     * @param isArchived the is archived
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByG_A_First(long groupId, boolean isArchived,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByG_A_First(groupId, isArchived, orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", isArchived=");
        msg.append(isArchived);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
    }

    /**
     * Returns the first farmer in the ordered set where groupId = &#63; and isArchived = &#63;.
     *
     * @param groupId the group ID
     * @param isArchived the is archived
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByG_A_First(long groupId, boolean isArchived,
        OrderByComparator orderByComparator) throws SystemException {
        List<Farmer> list = findByG_A(groupId, isArchived, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last farmer in the ordered set where groupId = &#63; and isArchived = &#63;.
     *
     * @param groupId the group ID
     * @param isArchived the is archived
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByG_A_Last(long groupId, boolean isArchived,
        OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByG_A_Last(groupId, isArchived, orderByComparator);

        if (farmer != null) {
            return farmer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", isArchived=");
        msg.append(isArchived);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFarmerException(msg.toString());
    }

    /**
     * Returns the last farmer in the ordered set where groupId = &#63; and isArchived = &#63;.
     *
     * @param groupId the group ID
     * @param isArchived the is archived
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByG_A_Last(long groupId, boolean isArchived,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_A(groupId, isArchived);

        if (count == 0) {
            return null;
        }

        List<Farmer> list = findByG_A(groupId, isArchived, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the farmers before and after the current farmer in the ordered set where groupId = &#63; and isArchived = &#63;.
     *
     * @param farmerId the primary key of the current farmer
     * @param groupId the group ID
     * @param isArchived the is archived
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer[] findByG_A_PrevAndNext(long farmerId, long groupId,
        boolean isArchived, OrderByComparator orderByComparator)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = findByPrimaryKey(farmerId);

        Session session = null;

        try {
            session = openSession();

            Farmer[] array = new FarmerImpl[3];

            array[0] = getByG_A_PrevAndNext(session, farmer, groupId,
                    isArchived, orderByComparator, true);

            array[1] = farmer;

            array[2] = getByG_A_PrevAndNext(session, farmer, groupId,
                    isArchived, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Farmer getByG_A_PrevAndNext(Session session, Farmer farmer,
        long groupId, boolean isArchived, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FARMER_WHERE);

        query.append(_FINDER_COLUMN_G_A_GROUPID_2);

        query.append(_FINDER_COLUMN_G_A_ISARCHIVED_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(FarmerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        qPos.add(isArchived);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(farmer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Farmer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the farmers where groupId = &#63; and isArchived = &#63; from the database.
     *
     * @param groupId the group ID
     * @param isArchived the is archived
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_A(long groupId, boolean isArchived)
        throws SystemException {
        for (Farmer farmer : findByG_A(groupId, isArchived, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(farmer);
        }
    }

    /**
     * Returns the number of farmers where groupId = &#63; and isArchived = &#63;.
     *
     * @param groupId the group ID
     * @param isArchived the is archived
     * @return the number of matching farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_A(long groupId, boolean isArchived)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_A;

        Object[] finderArgs = new Object[] { groupId, isArchived };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_FARMER_WHERE);

            query.append(_FINDER_COLUMN_G_A_GROUPID_2);

            query.append(_FINDER_COLUMN_G_A_ISARCHIVED_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(isArchived);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the farmer in the entity cache if it is enabled.
     *
     * @param farmer the farmer
     */
    @Override
    public void cacheResult(Farmer farmer) {
        EntityCacheUtil.putResult(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerImpl.class, farmer.getPrimaryKey(), farmer);

        farmer.resetOriginalValues();
    }

    /**
     * Caches the farmers in the entity cache if it is enabled.
     *
     * @param farmers the farmers
     */
    @Override
    public void cacheResult(List<Farmer> farmers) {
        for (Farmer farmer : farmers) {
            if (EntityCacheUtil.getResult(
                        FarmerModelImpl.ENTITY_CACHE_ENABLED, FarmerImpl.class,
                        farmer.getPrimaryKey()) == null) {
                cacheResult(farmer);
            } else {
                farmer.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all farmers.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(FarmerImpl.class.getName());
        }

        EntityCacheUtil.clearCache(FarmerImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the farmer.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Farmer farmer) {
        EntityCacheUtil.removeResult(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerImpl.class, farmer.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Farmer> farmers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Farmer farmer : farmers) {
            EntityCacheUtil.removeResult(FarmerModelImpl.ENTITY_CACHE_ENABLED,
                FarmerImpl.class, farmer.getPrimaryKey());
        }
    }

    /**
     * Creates a new farmer with the primary key. Does not add the farmer to the database.
     *
     * @param farmerId the primary key for the new farmer
     * @return the new farmer
     */
    @Override
    public Farmer create(long farmerId) {
        Farmer farmer = new FarmerImpl();

        farmer.setNew(true);
        farmer.setPrimaryKey(farmerId);

        return farmer;
    }

    /**
     * Removes the farmer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param farmerId the primary key of the farmer
     * @return the farmer that was removed
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer remove(long farmerId)
        throws NoSuchFarmerException, SystemException {
        return remove((Serializable) farmerId);
    }

    /**
     * Removes the farmer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the farmer
     * @return the farmer that was removed
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer remove(Serializable primaryKey)
        throws NoSuchFarmerException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Farmer farmer = (Farmer) session.get(FarmerImpl.class, primaryKey);

            if (farmer == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchFarmerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(farmer);
        } catch (NoSuchFarmerException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Farmer removeImpl(Farmer farmer) throws SystemException {
        farmer = toUnwrappedModel(farmer);

        farmerToDistrictTableMapper.deleteLeftPrimaryKeyTableMappings(farmer.getPrimaryKey());

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(farmer)) {
                farmer = (Farmer) session.get(FarmerImpl.class,
                        farmer.getPrimaryKeyObj());
            }

            if (farmer != null) {
                session.delete(farmer);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (farmer != null) {
            clearCache(farmer);
        }

        return farmer;
    }

    @Override
    public Farmer updateImpl(com.liferay.docs.infos.model.Farmer farmer)
        throws SystemException {
        farmer = toUnwrappedModel(farmer);

        boolean isNew = farmer.isNew();

        FarmerModelImpl farmerModelImpl = (FarmerModelImpl) farmer;

        Session session = null;

        try {
            session = openSession();

            if (farmer.isNew()) {
                session.save(farmer);

                farmer.setNew(false);
            } else {
                session.merge(farmer);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !FarmerModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((farmerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        farmerModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { farmerModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((farmerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_O.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        farmerModelImpl.getOriginalGroupId(),
                        farmerModelImpl.getOriginalOrgName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_O, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_O,
                    args);

                args = new Object[] {
                        farmerModelImpl.getGroupId(),
                        farmerModelImpl.getOrgName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_O, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_O,
                    args);
            }

            if ((farmerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_I.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        farmerModelImpl.getOriginalGroupId(),
                        farmerModelImpl.getOriginalInn()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_I, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_I,
                    args);

                args = new Object[] {
                        farmerModelImpl.getGroupId(), farmerModelImpl.getInn()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_I, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_I,
                    args);
            }

            if ((farmerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_D.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        farmerModelImpl.getOriginalGroupId(),
                        farmerModelImpl.getOriginalDistrictId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_D, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_D,
                    args);

                args = new Object[] {
                        farmerModelImpl.getGroupId(),
                        farmerModelImpl.getDistrictId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_D, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_D,
                    args);
            }

            if ((farmerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        farmerModelImpl.getOriginalGroupId(),
                        farmerModelImpl.getOriginalRegDate()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_R, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R,
                    args);

                args = new Object[] {
                        farmerModelImpl.getGroupId(),
                        farmerModelImpl.getRegDate()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_R, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R,
                    args);
            }

            if ((farmerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        farmerModelImpl.getOriginalGroupId(),
                        farmerModelImpl.getOriginalIsArchived()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_A, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A,
                    args);

                args = new Object[] {
                        farmerModelImpl.getGroupId(),
                        farmerModelImpl.getIsArchived()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_A, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A,
                    args);
            }
        }

        EntityCacheUtil.putResult(FarmerModelImpl.ENTITY_CACHE_ENABLED,
            FarmerImpl.class, farmer.getPrimaryKey(), farmer);

        return farmer;
    }

    protected Farmer toUnwrappedModel(Farmer farmer) {
        if (farmer instanceof FarmerImpl) {
            return farmer;
        }

        FarmerImpl farmerImpl = new FarmerImpl();

        farmerImpl.setNew(farmer.isNew());
        farmerImpl.setPrimaryKey(farmer.getPrimaryKey());

        farmerImpl.setFarmerId(farmer.getFarmerId());
        farmerImpl.setCompanyId(farmer.getCompanyId());
        farmerImpl.setGroupId(farmer.getGroupId());
        farmerImpl.setUserId(farmer.getUserId());
        farmerImpl.setCreateDate(farmer.getCreateDate());
        farmerImpl.setModifiedDate(farmer.getModifiedDate());
        farmerImpl.setOrgName(farmer.getOrgName());
        farmerImpl.setLegalForm(farmer.getLegalForm());
        farmerImpl.setInn(farmer.getInn());
        farmerImpl.setKpp(farmer.getKpp());
        farmerImpl.setOgrn(farmer.getOgrn());
        farmerImpl.setRegDate(farmer.getRegDate());
        farmerImpl.setIsArchived(farmer.isIsArchived());
        farmerImpl.setDistrictId(farmer.getDistrictId());

        return farmerImpl;
    }

    /**
     * Returns the farmer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the farmer
     * @return the farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByPrimaryKey(Serializable primaryKey)
        throws NoSuchFarmerException, SystemException {
        Farmer farmer = fetchByPrimaryKey(primaryKey);

        if (farmer == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchFarmerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return farmer;
    }

    /**
     * Returns the farmer with the primary key or throws a {@link com.liferay.docs.infos.NoSuchFarmerException} if it could not be found.
     *
     * @param farmerId the primary key of the farmer
     * @return the farmer
     * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer findByPrimaryKey(long farmerId)
        throws NoSuchFarmerException, SystemException {
        return findByPrimaryKey((Serializable) farmerId);
    }

    /**
     * Returns the farmer with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the farmer
     * @return the farmer, or <code>null</code> if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Farmer farmer = (Farmer) EntityCacheUtil.getResult(FarmerModelImpl.ENTITY_CACHE_ENABLED,
                FarmerImpl.class, primaryKey);

        if (farmer == _nullFarmer) {
            return null;
        }

        if (farmer == null) {
            Session session = null;

            try {
                session = openSession();

                farmer = (Farmer) session.get(FarmerImpl.class, primaryKey);

                if (farmer != null) {
                    cacheResult(farmer);
                } else {
                    EntityCacheUtil.putResult(FarmerModelImpl.ENTITY_CACHE_ENABLED,
                        FarmerImpl.class, primaryKey, _nullFarmer);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(FarmerModelImpl.ENTITY_CACHE_ENABLED,
                    FarmerImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return farmer;
    }

    /**
     * Returns the farmer with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param farmerId the primary key of the farmer
     * @return the farmer, or <code>null</code> if a farmer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Farmer fetchByPrimaryKey(long farmerId) throws SystemException {
        return fetchByPrimaryKey((Serializable) farmerId);
    }

    /**
     * Returns all the farmers.
     *
     * @return the farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the farmers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of farmers
     * @param end the upper bound of the range of farmers (not inclusive)
     * @return the range of farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the farmers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of farmers
     * @param end the upper bound of the range of farmers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Farmer> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Farmer> list = (List<Farmer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_FARMER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_FARMER;

                if (pagination) {
                    sql = sql.concat(FarmerModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Farmer>(list);
                } else {
                    list = (List<Farmer>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the farmers from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Farmer farmer : findAll()) {
            remove(farmer);
        }
    }

    /**
     * Returns the number of farmers.
     *
     * @return the number of farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_FARMER);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the districts associated with the farmer.
     *
     * @param pk the primary key of the farmer
     * @return the districts associated with the farmer
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<com.liferay.docs.infos.model.District> getDistricts(long pk)
        throws SystemException {
        return getDistricts(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
    }

    /**
     * Returns a range of all the districts associated with the farmer.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param pk the primary key of the farmer
     * @param start the lower bound of the range of farmers
     * @param end the upper bound of the range of farmers (not inclusive)
     * @return the range of districts associated with the farmer
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<com.liferay.docs.infos.model.District> getDistricts(long pk,
        int start, int end) throws SystemException {
        return getDistricts(pk, start, end, null);
    }

    /**
     * Returns an ordered range of all the districts associated with the farmer.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param pk the primary key of the farmer
     * @param start the lower bound of the range of farmers
     * @param end the upper bound of the range of farmers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of districts associated with the farmer
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<com.liferay.docs.infos.model.District> getDistricts(long pk,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return farmerToDistrictTableMapper.getRightBaseModels(pk, start, end,
            orderByComparator);
    }

    /**
     * Returns the number of districts associated with the farmer.
     *
     * @param pk the primary key of the farmer
     * @return the number of districts associated with the farmer
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getDistrictsSize(long pk) throws SystemException {
        long[] pks = farmerToDistrictTableMapper.getRightPrimaryKeys(pk);

        return pks.length;
    }

    /**
     * Returns <code>true</code> if the district is associated with the farmer.
     *
     * @param pk the primary key of the farmer
     * @param districtPK the primary key of the district
     * @return <code>true</code> if the district is associated with the farmer; <code>false</code> otherwise
     * @throws SystemException if a system exception occurred
     */
    @Override
    public boolean containsDistrict(long pk, long districtPK)
        throws SystemException {
        return farmerToDistrictTableMapper.containsTableMapping(pk, districtPK);
    }

    /**
     * Returns <code>true</code> if the farmer has any districts associated with it.
     *
     * @param pk the primary key of the farmer to check for associations with districts
     * @return <code>true</code> if the farmer has any districts associated with it; <code>false</code> otherwise
     * @throws SystemException if a system exception occurred
     */
    @Override
    public boolean containsDistricts(long pk) throws SystemException {
        if (getDistrictsSize(pk) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Adds an association between the farmer and the district. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the farmer
     * @param districtPK the primary key of the district
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addDistrict(long pk, long districtPK) throws SystemException {
        farmerToDistrictTableMapper.addTableMapping(pk, districtPK);
    }

    /**
     * Adds an association between the farmer and the district. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the farmer
     * @param district the district
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addDistrict(long pk,
        com.liferay.docs.infos.model.District district)
        throws SystemException {
        farmerToDistrictTableMapper.addTableMapping(pk, district.getPrimaryKey());
    }

    /**
     * Adds an association between the farmer and the districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the farmer
     * @param districtPKs the primary keys of the districts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addDistricts(long pk, long[] districtPKs)
        throws SystemException {
        for (long districtPK : districtPKs) {
            farmerToDistrictTableMapper.addTableMapping(pk, districtPK);
        }
    }

    /**
     * Adds an association between the farmer and the districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the farmer
     * @param districts the districts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addDistricts(long pk,
        List<com.liferay.docs.infos.model.District> districts)
        throws SystemException {
        for (com.liferay.docs.infos.model.District district : districts) {
            farmerToDistrictTableMapper.addTableMapping(pk,
                district.getPrimaryKey());
        }
    }

    /**
     * Clears all associations between the farmer and its districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the farmer to clear the associated districts from
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void clearDistricts(long pk) throws SystemException {
        farmerToDistrictTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
    }

    /**
     * Removes the association between the farmer and the district. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the farmer
     * @param districtPK the primary key of the district
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeDistrict(long pk, long districtPK)
        throws SystemException {
        farmerToDistrictTableMapper.deleteTableMapping(pk, districtPK);
    }

    /**
     * Removes the association between the farmer and the district. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the farmer
     * @param district the district
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeDistrict(long pk,
        com.liferay.docs.infos.model.District district)
        throws SystemException {
        farmerToDistrictTableMapper.deleteTableMapping(pk,
            district.getPrimaryKey());
    }

    /**
     * Removes the association between the farmer and the districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the farmer
     * @param districtPKs the primary keys of the districts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeDistricts(long pk, long[] districtPKs)
        throws SystemException {
        for (long districtPK : districtPKs) {
            farmerToDistrictTableMapper.deleteTableMapping(pk, districtPK);
        }
    }

    /**
     * Removes the association between the farmer and the districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the farmer
     * @param districts the districts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeDistricts(long pk,
        List<com.liferay.docs.infos.model.District> districts)
        throws SystemException {
        for (com.liferay.docs.infos.model.District district : districts) {
            farmerToDistrictTableMapper.deleteTableMapping(pk,
                district.getPrimaryKey());
        }
    }

    /**
     * Sets the districts associated with the farmer, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the farmer
     * @param districtPKs the primary keys of the districts to be associated with the farmer
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void setDistricts(long pk, long[] districtPKs)
        throws SystemException {
        Set<Long> newDistrictPKsSet = SetUtil.fromArray(districtPKs);
        Set<Long> oldDistrictPKsSet = SetUtil.fromArray(farmerToDistrictTableMapper.getRightPrimaryKeys(
                    pk));

        Set<Long> removeDistrictPKsSet = new HashSet<Long>(oldDistrictPKsSet);

        removeDistrictPKsSet.removeAll(newDistrictPKsSet);

        for (long removeDistrictPK : removeDistrictPKsSet) {
            farmerToDistrictTableMapper.deleteTableMapping(pk, removeDistrictPK);
        }

        newDistrictPKsSet.removeAll(oldDistrictPKsSet);

        for (long newDistrictPK : newDistrictPKsSet) {
            farmerToDistrictTableMapper.addTableMapping(pk, newDistrictPK);
        }
    }

    /**
     * Sets the districts associated with the farmer, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the farmer
     * @param districts the districts to be associated with the farmer
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void setDistricts(long pk,
        List<com.liferay.docs.infos.model.District> districts)
        throws SystemException {
        try {
            long[] districtPKs = new long[districts.size()];

            for (int i = 0; i < districts.size(); i++) {
                com.liferay.docs.infos.model.District district = districts.get(i);

                districtPKs[i] = district.getPrimaryKey();
            }

            setDistricts(pk, districtPKs);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            FinderCacheUtil.clearCache(FarmerModelImpl.MAPPING_TABLE_INFOS_FARMERS_DISTRICTS_NAME);
        }
    }

    /**
     * Initializes the farmer persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.liferay.docs.infos.model.Farmer")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Farmer>> listenersList = new ArrayList<ModelListener<Farmer>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Farmer>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }

        farmerToDistrictTableMapper = TableMapperFactory.getTableMapper("infos_Farmers_Districts",
                "farmerId", "districtId", this, districtPersistence);
    }

    public void destroy() {
        EntityCacheUtil.removeCache(FarmerImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        TableMapperFactory.removeTableMapper("infos_Farmers_Districts");
    }
}
