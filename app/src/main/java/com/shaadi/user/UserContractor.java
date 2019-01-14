package com.shaadi.user;

import com.shaadi.models.User;
import com.shaadi.models.UserList;

import java.util.List;

/**
 * @author Ravishankar
 * @version 1.0
 * @since 11-01-2019
 */
public class UserContractor {
    public interface View {
        void showUserList(List<User> users);
        void showErrorOnUserLoad();
    }

    public interface Presenter {
        void loadUser();
        void userLoadedSuccess(UserList users);
        void userLoadedFailure();
    }

    public interface Interactor {
        void fetchUserByAPi(int userCount);
    }
}
