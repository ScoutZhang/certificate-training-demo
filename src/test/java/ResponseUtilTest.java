import org.junit.Test;
import xin.scoutzhang.domain.Resource;
import xin.scoutzhang.domain.User;
import xin.scoutzhang.dto.Response;
import xin.scoutzhang.util.ResponseUtil;

/**
 * Created by DEAN on 2018/4/10.
 */
public class ResponseUtilTest {
    @Test
    public void TestSuccessResponse(){
        User test = new User();

        Response response = ResponseUtil.successResponse(test);

        System.out.println(response.getData() instanceof User);
    }
}
