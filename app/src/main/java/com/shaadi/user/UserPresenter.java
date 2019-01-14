package com.shaadi.user;

import android.content.Context;
import com.shaadi.models.UserList;
import com.shaadi.setting.Config;

/**
 * @author Ravishankar
 * @version 1.0
 * @since 11-01-2019
 */
public class UserPresenter implements UserContractor.Presenter {
    private Context mContext;
    private UserContractor.View mView;
    private UserInteractor mInteractor;

    public UserPresenter(Context mContext, UserContractor.View mView) {
        this.mContext = mContext;
        this.mView = mView;
        mInteractor = new UserInteractor(mContext, this);
    }

    @Override
    public void loadUser() {
        mInteractor.fetchUserByAPi(Config.NO_OF_USER);
    }

    @Override
    public void userLoadedSuccess(UserList users) {
        mView.showUserList(users.getResults());
    }

    @Override
    public void userLoadedFailure() {

    }
}
