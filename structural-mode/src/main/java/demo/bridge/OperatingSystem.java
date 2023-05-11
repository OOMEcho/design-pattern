package demo.bridge;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 22:19
 * @Description: 抽象化角色
 */
public abstract class OperatingSystem {

    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    /**
     * 播放
     */
    public abstract void play(String fileName);
}
