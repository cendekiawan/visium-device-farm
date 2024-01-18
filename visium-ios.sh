#!/bin/bash
set -x


# step 1: get all devide id of iOS
# Make the GET request and capture the JSON response
response=$(curl -s -X GET https://farmdemo.visiumlabs.com/api/devices?os=iOS \
-H "Content-Type: application/json" \
-H "X-VisiumFarm-Api-Key: 2q3Ue23QgD.Xj0TMbjEpzr2Zf6PfngagnetePGiOjubCr6aUwN0")

# Extract the 'id' attributes from the JSON response and format output with double quotes
ids='"2b9c4327ae1d7266c8c374ccdb20dcbf25e5859e","ba17673a69babbfb4caf35daee88e2090a7215d8","00008120-000914192650A01E","00008020-0014458A14BA002E","4488f63b32e9e5bc1b42799eff3f2cbe0d01936c"'


# Output the extracted 'id' attributes in the required format
echo "$ids"

export ids=$ids


# step 2: upload IPA file and get the id of IPA file
# Set the necessary variables
API_KEY="2q3Ue23QgD.Xj0TMbjEpzr2Zf6PfngagnetePGiOjubCr6aUwN0"
FILE_PATH="testingVisium.ipa"
API_URL="https://farmdemo.visiumlabs.com/api/v1/apps"

# Make the POST request and capture the response
response=$(curl -s -X POST "$API_URL" \
-H "X-VisiumFarm-Api-Key: $API_KEY" \
-F "file=@$FILE_PATH")

# Extract the 'id' attribute using jq

appId=$(echo "$response" | grep -o '"id" : [0-9]*' | cut -d':' -f2 | tr -d ' ')


# Output the extracted 'appId'
echo "The extracted appId is: $appId"

export appId=$appId

# step 3: Install the IPA in all iOS devices
curl -X POST https://farmdemo.visiumlabs.com/api/apk/install \
-H "Content-Type: application/json" \
-H "X-VisiumFarm-Api-Key: 2q3Ue23QgD.Xj0TMbjEpzr2Zf6PfngagnetePGiOjubCr6aUwN0" \
-d '{
  "appList": [
    {
      "appId": '"$appId"', 
      "type": "iOS"
    }
  ],
  "deviceList": [
    '"$ids"'
  ]
}'
