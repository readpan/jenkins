
# 命令行中通过conda创建虚拟环境

import os
import sys
import subprocess

# 通过conda创建虚拟环境, 如果已经存在则不创建

def create_env(env_name, python_version):
    # 判断环境是否存在
    env_list = subprocess.run(['conda', 'env', 'list'], stdout=subprocess.PIPE)
    env_list = env_list.stdout.decode('utf-8')
    env_list = env_list.split('\n')
    env_list = [i.split()[0] for i in env_list if len(i.split()) > 0]
    if env_name in env_list:
        print('Environment {} already exists.'.format(env_name))
        return
    # 创建虚拟环境
    subprocess.run(['conda', 'create', '-n', env_name, 'python={}'.format(python_version), '-y'])
    print('Environment {} created.'.format(env_name))


if __name__ == '__main__':
    env_name = sys.argv[1]
    python_version = sys.argv[2]
    create_env(env_name, python_version)