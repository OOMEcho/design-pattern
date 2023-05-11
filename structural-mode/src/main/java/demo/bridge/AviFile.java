package demo.bridge;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 22:18
 * @Description: 具体实现化角色
 */
public class AviFile implements VideoFile{

    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}
