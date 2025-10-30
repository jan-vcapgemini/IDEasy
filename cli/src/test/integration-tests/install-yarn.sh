echo "Running install yarn integration test"
ide -d install yarn

yarn_location=""

if doIsWindows
then
  yarn_location=""
else
  yarn_location="bin/"
fi

find "${IDE_ROOT}/${TEST_PROJECT_NAME}/software/node"

assertThat "${IDE_ROOT}/${TEST_PROJECT_NAME}/software/node/${yarn_location}yarn" exists
