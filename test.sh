#!/bin/bash

# Function to install jq based on the package manager
install_jq() {
    if [ -x "$(command -v apt-get)" ]; then
        sudo apt-get update
        sudo apt-get install -y jq
    elif [ -x "$(command -v dnf)" ]; then
        sudo dnf install -y jq
    elif [ -x "$(command -v brew)" ]; then
        brew install jq
    else
        echo "Unsupported package manager. Please install jq manually."
        exit 1
    fi
}

# Check if jq is installed
if ! command -v jq &> /dev/null; then
    echo "jq is not installed. Installing..."
    install_jq
fi

# Now jq is guaranteed to be installed; you can continue with your script logic below
echo "jq is installed. Proceeding with the rest of the script."
