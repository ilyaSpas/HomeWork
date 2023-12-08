package service;

import dao.UserDao;
import dto.CreateUserDto;
import entity.User;
import exception.ValidationException;
import mapper.CreateUserMapper;
import validator.CreateUserValidator;
import validator.ValidationResult;

public class UserService {
    private static final UserService INSTANCE = new UserService();
    private final CreateUserValidator createUserValidator = CreateUserValidator.getInstance();
    private final UserDao userDao = UserDao.getInstance();
    private final CreateUserMapper createUserMapper = CreateUserMapper.getInstance();

    public Integer create(CreateUserDto createUserDto){
        ValidationResult validationResult = createUserValidator.isValid(createUserDto);
        if (!validationResult.isValid()){
            throw new ValidationException(validationResult.getErrors());
        }
        User user = createUserMapper.mapFrom(createUserDto);
        userDao.save(user);
        return user.getId();
    }
    public static UserService getInstance(){
        return INSTANCE;
    }
}
