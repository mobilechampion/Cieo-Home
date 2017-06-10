package com.kinetise.data.application.actionmanager.functioncommands;

import com.kinetise.data.application.IAGApplication;
import com.kinetise.data.descriptors.actions.AbstractFunctionDataDesc;

public class FunctionLower extends AbstractCompareFunction {
    public FunctionLower(AbstractFunctionDataDesc functionDesc, IAGApplication application) {
        super(functionDesc, application);
    }

    @Override
    public Object execute(Object desc) {
        super.execute(desc);
        return compare() < 0 ? StringLogicValues.TRUE : StringLogicValues.FALSE;
    }
}
