package mapper;

import dto.CreateUserDto;
import entity.Gender;
import entity.Role;
import entity.User;
import utils.LocalDateFormatter;

public class CreateUserMapper implements Mapper<CreateUserDto, User> {
    private static final CreateUserMapper INSTANCE = new CreateUserMapper();
    @Override
    public User mapFrom(CreateUserDto object) {
        return User.builder()
                .name(object.getName())
                .email(object.getEmail())
                .password(object.getPassword())
                .gender(Gender.valueOf(object.getGender()))
                .role(Role.valueOf(object.getRole()))
                .birthday(LocalDateFormatter.format(object.getBirthday()))
                .build();
    }

    public static CreateUserMapper getInstance(){
        return INSTANCE;
    }
}
