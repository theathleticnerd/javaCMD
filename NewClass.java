import java.util.*;
class NewClass 
{ 
	public static void main(String[] args) 
	{ 
		try
		{ 
		// We are running "dir" and "ping" command on cmd 
		Runtime.getRuntime().exec("cmd /c start cmd.exe /K \" cd ffmpeg && mkdir 1080p && mkdir 720p && mkdir 480p && mkdir 360p && ffmpeg -hide_banner -y -i BIRTHDAY \
  -vf scale=w=640:h=360:force_original_aspect_ratio=decrease -c:a aac -ar 48000 -c:v h264 -profile:v main -crf 20 -sc_threshold 0 -g 48 -keyint_min 48 -hls_time 4 -hls_playlist_type vod  -b:v 800k -maxrate 856k -bufsize 1200k -b:a 96k -hls_segment_filename 360p/360p_%03d.ts 360p/360p.m3u8 \
  -vf scale=w=842:h=480:force_original_aspect_ratio=decrease -c:a aac -ar 48000 -c:v h264 -profile:v main -crf 20 -sc_threshold 0 -g 48 -keyint_min 48 -hls_time 4 -hls_playlist_type vod -b:v 1400k -maxrate 1498k -bufsize 2100k -b:a 128k -hls_segment_filename 480p/480p_%03d.ts 480p/480p.m3u8 \
  -vf scale=w=1280:h=720:force_original_aspect_ratio=decrease -c:a aac -ar 48000 -c:v h264 -profile:v main -crf 20 -sc_threshold 0 -g 48 -keyint_min 48 -hls_time 4 -hls_playlist_type vod -b:v 2800k -maxrate 2996k -bufsize 4200k -b:a 128k -hls_segment_filename 720p/720p_%03d.ts 720p/720p.m3u8 \
  -vf scale=w=1920:h=1080:force_original_aspect_ratio=decrease -c:a aac -ar 48000 -c:v h264 -profile:v main -crf 20 -sc_threshold 0 -g 48 -keyint_min 48 -hls_time 4 -hls_playlist_type vod -b:v 5000k -maxrate 5350k -bufsize 7500k -b:a 192k -hls_segment_filename 1080p/1080p_%03d.ts 1080p/1080p.m3u8  \""); 
		} 
		catch (Exception e) 
		{ 
			System.out.println("HEY Buddy ! U r Doing Something Wrong "); 
			e.printStackTrace(); 
		} 
	} 
} 
