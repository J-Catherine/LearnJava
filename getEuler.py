import urllib.request  
import sys 
import os

def getHtml(url):  
    html = urllib.request.urlopen(url).read()  
    return html

def getEuler(num):
    html = getHtml("http://pe-cn.github.io/"+str(num)).decode("utf-8")
    indexs = []
    temp = html.find("<hr>")
    while temp != -1:
        indexs.append(temp)
        temp =  html.find("<hr>",temp+2)
    html = html[indexs[0]+4:indexs[3]]
    with open("Problems/P"+str(num)+".html","w",encoding="utf-8") as fout:
        fout.write(html)
    with open("C:/Users/Catherine_JY/Desktop/LovePlan/欧拉计划/Problems/P"+str(num)+".html","w",encoding="utf-8") as fout:
        fout.write(html)
    print("已下载Problems/P"+str(num))

if __name__ == "__main__":
    readme = """使用说明:
        python getEuler.py [arg1] (arg2 arg3 ... )
        [--help]/[-h] 显示使用说明
        [--clean]/[-c] 清理Problems文件夹
        [--download]/[-d] (p1 p2 .. pk ..)下载题目p1,p2 .. pk 到 Problems文件夹
        [p1] (p2 p3 .. pk) 下载题目p1,p2 .. pk 到 Problems文件夹"""
    argv = sys.argv
    if len(argv) == 1 or argv[1] == "--help" or argv[1] == "-h":
        print(readme)
    elif argv[1] == "--clean" or argv[1] == "-c":
        os.system("rm Problems/*")
        os.system("rm C:/Users/Catherine_JY/Desktop/LovePlan/欧拉计划/Problems/*")
        print("已清理Problems文件夹")
    elif argv[1] == "--download" or argv[1] == "-d":
        try:
            for each in argv[2:]:
                getEuler(int(each))
        except:
            print("题号错误！")
    else:
        try:
            for each in argv[1:]:
                getEuler(int(each)) 
        except:
            print("参数错误")
            print(readme)

        
    
    