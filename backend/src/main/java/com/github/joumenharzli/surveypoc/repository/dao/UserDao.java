/*
 * Copyright (C) 2021 Sheikh Arsalan
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */


import java.util.List;

/**
 * User Dao
 *
 * @author Sheikh Arsalan
 */
public interface UserDao {

  /**
   * Returns the list of ids of the not found users using ids
   *
   * @param usersIds ids of the users to check
   * @return a list of the ids of the not found users
   * @throws DaoException             if there is an sql exception
   * @throws IllegalArgumentException if any given argument is invalid
   */
  List<Long> findNonExistingUsersByUsersIds(List<Long> usersIds);
}
