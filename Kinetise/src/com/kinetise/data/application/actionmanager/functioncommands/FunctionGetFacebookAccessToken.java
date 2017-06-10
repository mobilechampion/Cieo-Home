package com.kinetise.data.application.actionmanager.functioncommands;

import com.kinetise.data.application.IAGApplication;
import com.kinetise.data.application.sdk.ActionManager;
import com.kinetise.data.descriptors.actions.AbstractFunctionDataDesc;

/**
 * Created by Kuba Komorowski on 2014-06-27.
 * <p>
 * Funkcja sluzaca do pozyskiwania tokena z facebooka, potrzebnego do wyswietlenia facebookowego walla
 */
public class FunctionGetFacebookAccessToken extends AbstractFunction {

    public FunctionGetFacebookAccessToken(AbstractFunctionDataDesc functionDesc, IAGApplication application) {
        super(functionDesc, application);
    }

    @Override
    public Object execute(Object desc) {
        super.execute(desc);
        return ActionManager.getInstance().getFacebookAccessToken();
    }
}

