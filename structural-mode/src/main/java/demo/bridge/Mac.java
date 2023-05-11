package demo.bridge;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 22:21
 * @Description: 扩展抽象化角色
 */
public class Mac extends OperatingSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        super.videoFile.decode(fileName);
    }
}
