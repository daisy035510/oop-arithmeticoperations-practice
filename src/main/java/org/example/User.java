package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {

//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator(); // 우리가 컨트롤 할 수 없는 부분은 삭제
        String password = passwordGenerator.generatePassword();
        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야한다
         */
        if(password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
