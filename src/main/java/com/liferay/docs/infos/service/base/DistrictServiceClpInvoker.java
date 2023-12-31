package com.liferay.docs.infos.service.base;

import com.liferay.docs.infos.service.DistrictServiceUtil;

import java.util.Arrays;

/**
 * @author Joe Bloggs
 * @generated
 */
public class DistrictServiceClpInvoker {
    private String _methodName24;
    private String[] _methodParameterTypes24;
    private String _methodName25;
    private String[] _methodParameterTypes25;

    public DistrictServiceClpInvoker() {
        _methodName24 = "getBeanIdentifier";

        _methodParameterTypes24 = new String[] {  };

        _methodName25 = "setBeanIdentifier";

        _methodParameterTypes25 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName24.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
            return DistrictServiceUtil.getBeanIdentifier();
        }

        if (_methodName25.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
            DistrictServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
