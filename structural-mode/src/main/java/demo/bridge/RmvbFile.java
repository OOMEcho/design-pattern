package demo.bridge;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 22:19
 * @Description: 具体实现化角色
 */
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件：" + fileName);
    }
}
