package gov.jiusan.star.user;

/**
 * @author Marcus Lin
 */
interface UserRepositoryCustom {

    Long create(User entity);

    Long update(User entity);
}
