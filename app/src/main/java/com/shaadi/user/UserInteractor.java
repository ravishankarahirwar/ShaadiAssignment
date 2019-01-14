package com.shaadi.user;

import android.content.Context;
import android.util.Log;
import com.shaadi.apis.APIClient;
import com.shaadi.apis.APIInterface;
import com.shaadi.models.UserList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @author Ravishankar
 * @version 1.0
 * @since 11-01-2019
 */
public class UserInteractor implements UserContractor.Interactor {
    private static final String TAG = UserInteractor.class.getSimpleName();
    private Context mContext;
    private UserPresenter mPresenter;
    APIInterface apiInterface;

    public UserInteractor(Context mContext, UserPresenter mPresenter) {
        this.mContext = mContext;
        this.mPresenter = mPresenter;
        apiInterface = APIClient.getClient().create(APIInterface.class);
    }

    @Override
    public void fetchUserByAPi(int userCount) {

        Call<UserList> user = apiInterface.getUsers(2);
        user.enqueue(new Callback<UserList>() {
            @Override
            public void onResponse(Call<UserList> call, Response<UserList> response) {
                final UserList userList =(UserList)response.body();
                Log.d(TAG, "Api Response Successfully");
                mPresenter.userLoadedSuccess(userList);
            }

            @Override
            public void onFailure(Call<UserList> call, Throwable throwable) {
                Log.d(TAG, "Api Response with error : " + throwable.getMessage());
                mPresenter.userLoadedFailure();

            }
        });
    }
}
