package ro.sapo.examples.nestedifelse;

/**
 * Created by YG87WU on 5/3/2017.
 */
public class NestedIfElse {

	private static final int OK = 0;

	private static final int ERROR = 1;

	public static int deleteUser(String user) {
		return 0;
	}

	public static int deleteAccount(String user) {
		return 1;
	}

	public static void deleteUserException(String user) throws UserNotDeleted {
		throw new UserNotDeleted();
	}

	public static void deleteAccountException(String user) throws AccountNotDeleted {
		throw new AccountNotDeleted();
	}

	public static void main(String[] args) {
		deleteUserExceptionsCatch();
	}

	public static void deleteUserNestedIf() {
		String user = "Bogdan";
		if (deleteUser(user) == OK) {
			if (deleteAccount(user) == OK) {
				System.out.println("User deleted!!!");
			}
			else {
				System.out.println("User deleted but account not!!!");
			}
		}
		else {
			System.out.println("User not deleted!!!");
		}
	}

	public static void deleteUserExceptionsCatch() {
		String user = "Bogdan";

		try {
			deleteUserException(user);
			deleteAccountException(user);
		}
		catch (UserNotDeleted userNotDeleted) {
			System.out.println("User not deleted!!!");
		}
		catch (AccountNotDeleted accountNotDeleted) {
			System.out.println("User deleted but account not!!!");
		}

		System.out.println("User deleted!!!");

	}

}
