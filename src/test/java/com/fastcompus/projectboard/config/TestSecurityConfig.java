package com.fastcompus.projectboard.config;

import com.fastcompus.projectboard.domain.UserAccount;
import com.fastcompus.projectboard.repository.UserAccountRepository;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@Import(SecurityConfig.class)
public class TestSecurityConfig {

    @MockBean
    private UserAccountRepository userAccountRepository;

    @BeforeTestMethod
    public void securitySetUp() {
        given(userAccountRepository.findById(any())).willReturn(Optional.of(UserAccount.of("test", "pw", "test@mail.com", "testtt", "test memo")));
    }
}
