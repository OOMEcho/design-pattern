package demo.bridge;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 22:20
 * @Description: 扩展抽象化角色
 */
public class Windows extends OperatingSystem {

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        super.videoFile.decode(fileName);
    }
}
